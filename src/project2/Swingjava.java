package project2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swingjava extends JFrame implements ActionListener {
    // Questions, options, 50-50, answers
    String ques[] = {
            "Which language is used for Android app development?",
            "What is the time complexity of binary search?",
            "Who discovered the theory of general relativity?",
            "Which keyword is used to inherit a class in Java?",
            "What is the capital of Australia?",
            "Which method is used to start a thread in Java?",
            "Which HTML tag is used to create a hyperlink?",
            "Who is known as the father of computers?",
            "What is the output of 2 + 3 * 4 in Java?",
            "Which data structure uses FIFO (First In First Out)?"
    };

    String optio[][] = {
            {"Java", "Python", "Swift", "Kotlin"},
            {"O(n)", "O(log n)", "O(n log n)", "O(1)"},
            {"Newton", "Tesla", "Einstein", "Bohr"},
            {"implements", "extends", "super", "import"},
            {"Sydney", "Melbourne", "Canberra", "Perth"},
            {"run()", "start()", "begin()", "execute()"},
            {"<div>", "<a>", "<p>", "<link>"},
            {"Thomas Edison", "Charles Babbage", "Alan Turing", "Dennis Ritchie"},
            {"20", "14", "10", "17"},
            {"Stack", "Queue", "Tree", "Graph"}
    };

    String options5050[][] = {
            {"Java", "Kotlin"},
            {"O(n)", "O(log n)"},
            {"Tesla", "Einstein"},
            {"implements", "extends"},
            {"Melbourne", "Canberra"},
            {"run()", "start()"},
            {"<a>", "<link>"},
            {"Charles Babbage", "Alan Turing"},
            {"14", "10"},
            {"Stack", "Queue"}
    };

    String correoptions[] = {"D", "B", "C", "B", "C", "B", "B", "B", "B", "B"};

    // GUI components
    JLabel qLabel, moneyLabel;
    JRadioButton optA, optB, optC, optD;
    JButton nextBtn, lifelineBtn, quitBtn;
    ButtonGroup optionsGroup;

    int index = 0, moneyown = 0, mu5 = 0, mu7 = 0;
    boolean AP = false, FF = false;

    Swingjava() {
        setTitle("Quiz Game");
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        qLabel = new JLabel();
        qLabel.setBounds(30, 30, 500, 30);
        add(qLabel);

        optA = new JRadioButton();
        optB = new JRadioButton();
        optC = new JRadioButton();
        optD = new JRadioButton();
        optA.setBounds(50, 80, 200, 30);
        optB.setBounds(50, 120, 200, 30);
        optC.setBounds(50, 160, 200, 30);
        optD.setBounds(50, 200, 200, 30);

        optionsGroup = new ButtonGroup();
        optionsGroup.add(optA);
        optionsGroup.add(optB);
        optionsGroup.add(optC);
        optionsGroup.add(optD);

        add(optA);
        add(optB);
        add(optC);
        add(optD);

        nextBtn = new JButton("Submit");
        nextBtn.setBounds(50, 250, 100, 30);
        nextBtn.addActionListener(this);
        add(nextBtn);

        lifelineBtn = new JButton("Use Lifeline");
        lifelineBtn.setBounds(170, 250, 120, 30);
        lifelineBtn.addActionListener(this);
        add(lifelineBtn);

        quitBtn = new JButton("Quit");
        quitBtn.setBounds(310, 250, 100, 30);
        quitBtn.addActionListener(this);
        add(quitBtn);

        moneyLabel = new JLabel("Money: Rs. 0");
        moneyLabel.setBounds(450, 10, 150, 30);
        add(moneyLabel);

        loadQuestion();
        setVisible(true);
    }

    // Load question and options
    void loadQuestion() {
        qLabel.setText("Q" + (index + 1) + ". " + ques[index]);
        optA.setText("A. " + optio[index][0]);
        optB.setText("B. " + optio[index][1]);
        optC.setText("C. " + optio[index][2]);
        optD.setText("D. " + optio[index][3]);
        optionsGroup.clearSelection();
    }

    // Answer check
    void checkAnswer(String ans) {
        if (ans.equalsIgnoreCase(correoptions[index])) {
            JOptionPane.showMessageDialog(this, "Correct Answer!");
            if (index <= 4) {
                moneyown += 10000;
                if (index == 4) mu5 = moneyown;
            } else if (index <= 6) {
                moneyown += 10000;
                if (index == 6) mu7 = moneyown;
            } else {
                moneyown += 10000;
            }
            moneyLabel.setText("Money: Rs. " + moneyown);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong Answer! Correct is: " + correoptions[index]);
            if (index <= 4) moneyown = 0;
            else if (index <= 6) moneyown = mu5;
            else moneyown = mu7;

            JOptionPane.showMessageDialog(this, "Game Over! You take Rs. " + moneyown);
            System.exit(0);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextBtn) {
            String ans = "";
            if (optA.isSelected()) ans = "A";
            else if (optB.isSelected()) ans = "B";
            else if (optC.isSelected()) ans = "C";
            else if (optD.isSelected()) ans = "D";

            if (ans.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please select an option!");
                return;
            }
            checkAnswer(ans);
            index++;
            if (index < ques.length) {
                loadQuestion();
            } else {
                JOptionPane.showMessageDialog(this, "Congrats! You finished. Take Rs. " + moneyown);
                System.exit(0);
            }
        }

        if (e.getSource() == lifelineBtn) {
            if (AP && FF) {
                JOptionPane.showMessageDialog(this, "No lifelines left!");
            } else {
                String[] choices = new String[2];
                int ch = JOptionPane.showOptionDialog(this, "Choose Lifeline:", "Lifeline",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, new String[]{"Audience", "50-50"}, "Audience");

                if (ch == 0 && !AP) {
                    JOptionPane.showMessageDialog(this, "Audience suggests option: " + correoptions[index]);
                    AP = true;
                } else if (ch == 1 && !FF) {
                    JOptionPane.showMessageDialog(this, "Remaining Options: " +
                            options5050[index][0] + " , " + options5050[index][1]);
                    FF = true;
                } else {
                    JOptionPane.showMessageDialog(this, "Lifeline already used!");
                }
            }
        }

        if (e.getSource() == quitBtn) {
            JOptionPane.showMessageDialog(this, "You quit! Money: Rs. " + moneyown);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Swingjava();
    }
}