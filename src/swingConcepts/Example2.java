package swingConcepts;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic JComboBox Example");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🔹 Step 1: Categories and Subcategories
        HashMap<String, String[]> subCategories = new HashMap<>();
        subCategories.put("Electronics", new String[]{"Mobile", "Laptop", "Camera"});
        subCategories.put("Furniture", new String[]{"Chair", "Table", "Sofa"});
        subCategories.put("Clothing", new String[]{"Shirts", "Jeans", "Jackets"});
        subCategories.put("Groceries", new String[]{"Vegetables", "Fruits", "Snacks"});

        // 🔹 Step 2: Main categories
        String[] categories = {"Select Category", "Electronics", "Furniture", "Clothing", "Groceries"};

        // First ComboBox (Main Categories)
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setBounds(100, 50, 180, 30);

        // Label for result
        JLabel label = new JLabel("Choose category...");
        label.setBounds(100, 200, 250, 30);

        // 🔹 Step 3: Add Action Listener
        categoryComboBox.addActionListener(new ActionListener() {
            JComboBox<String> subComboBox = null; // keep reference to second combobox

            public void actionPerformed(ActionEvent e) {
                String selected = (String) categoryComboBox.getSelectedItem();

                // Remove old subComboBox if exists
                if (subComboBox != null) {
                    frame.remove(subComboBox);
                    subComboBox = null;
                    frame.repaint();
                }

                // If category has subcategories -> create second ComboBox
                if (subCategories.containsKey(selected)) {
                    subComboBox = new JComboBox<>(subCategories.get(selected));
                    subComboBox.setBounds(100, 100, 180, 30);

                    // Listener for subcategory
                    subComboBox.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            String subSelected = (String) subComboBox.getSelectedItem();
                            label.setText("Selected: " + selected + " → " + subSelected);
                        }
                    });

                    frame.add(subComboBox);
                    frame.revalidate();
                    frame.repaint();
                }
            }
        });

        frame.add(categoryComboBox);
        frame.add(label);
        frame.setVisible(true);
    }
}

