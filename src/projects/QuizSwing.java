package projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSwing extends JFrame implements ActionListener {
    String[] questions = {
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

    String[][] options = {
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

    String[] correctAnswers = {
        "Kotlin", "O(log n)", "Einstein", "extends", "Canberra",
        "start()", "<a>", "Charles Babbage", "14", "Queue"
    };

    JButton[] optionButtons = new JButton[4];
    JButton lifelineBtn1, lifelineBtn2, quitBtn;
    JLabel questionLabel, scoreLabel;
    int currentQuestion = 0;
    int score = 0;
    int mu5 = 0, mu7 = 0;
    boolean used5050 = false;
    boolean usedAudience = false;

    public QuizSwing() {
        setTitle("Dasaratha's Quiz Game");
        setSize(800, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        questionLabel = new JLabel("Question will appear here");
//        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        questionLabel.setBounds(50, 30, 700, 30);
        add(questionLabel);

        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JButton();
            optionButtons[i].addActionListener(this);
            optionButtons[i].setBounds(100 + (i % 2) * 300, 80 + (i / 2) * 60, 250, 40);
            add(optionButtons[i]);
        }

        lifelineBtn1 = new JButton("50-50");
        lifelineBtn1.setBounds(100, 220, 100, 30);
        lifelineBtn1.addActionListener(this);
        add(lifelineBtn1);

        lifelineBtn2 = new JButton("Audience Poll");
        lifelineBtn2.setBounds(220, 220, 150, 30);
        lifelineBtn2.addActionListener(this);
        add(lifelineBtn2);

        quitBtn = new JButton("Quit");
        quitBtn.setBounds(390, 220, 100, 30);
        quitBtn.addActionListener(this);
        add(quitBtn);

        scoreLabel = new JLabel("Score: ₹0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 14));
        scoreLabel.setBounds(600, 220, 150, 30);
        add(scoreLabel);

        loadQuestion();
        setVisible(true);
    }

    void loadQuestion() {
        if (currentQuestion >= questions.length) {
            JOptionPane.showMessageDialog(this, " Quiz Over! Final Score: ₹" + score);
            System.exit(0);
        }

        questionLabel.setText("Q" + (currentQuestion + 1) + ": " + questions[currentQuestion]);
        for (int i = 0; i < 4; i++) {
            optionButtons[i].setText(options[currentQuestion][i]);
            optionButtons[i].setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == quitBtn) {
            JOptionPane.showMessageDialog(this, "You chose to quit. Final Score: ₹" + score);
            System.exit(0);
        }

        if (src == lifelineBtn1 && !used5050) {
            used5050 = true;
            apply5050();
        } else if (src == lifelineBtn2 && !usedAudience) {
            usedAudience = true;
            JOptionPane.showMessageDialog(this, "Audience suggests: " + correctAnswers[currentQuestion]);
        } else if (src == lifelineBtn1 || src == lifelineBtn2) {
            JOptionPane.showMessageDialog(this, "Lifeline already used.");
        }

        for (int i = 0; i < 4; i++) {
            if (src == optionButtons[i]) {
                String selected = optionButtons[i].getText();
                if (selected.equals(correctAnswers[currentQuestion])) {
                    score += 10000;
                    if (currentQuestion == 4) mu5 = score;
                    if (currentQuestion == 6) mu7 = score;

                    scoreLabel.setText("Score: ₹" + score);
                    JOptionPane.showMessageDialog(this, "Correct!");
                    currentQuestion++;
                    loadQuestion();
                } else {
                    int finalMoney = 0;
                    if (currentQuestion <= 4) finalMoney = 0;
                    else if (currentQuestion <= 6) finalMoney = mu5;
                    else finalMoney = mu7;

                    JOptionPane.showMessageDialog(this, "Wrong! Correct answer: " + correctAnswers[currentQuestion]);
                    JOptionPane.showMessageDialog(this, "You take home: ₹" + finalMoney);
                    System.exit(0);
                }
                break;
            }
        }
    }

    void apply5050() {
        String correct = correctAnswers[currentQuestion];
        int shown = 0;
        for (int i = 0; i < 4; i++) {
            if (options[currentQuestion][i].equals(correct)) {
                shown++;
            } else if (shown < 1) {
                shown++;
            } else {
                optionButtons[i].setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new QuizSwing();
    }
}