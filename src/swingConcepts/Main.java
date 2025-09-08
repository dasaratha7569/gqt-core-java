package swingConcepts;

import javax.swing.*;
import java.util.*;

// MAIN CLASS (the entry point)
public class Main {
    public static void main(String[] args) {
        new LoginFrame1();
    }
}

// Product CLASS
class Product {
    String name;
    String category;
    String description;
    int price;

    public Product(String name, String category, String description, int price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }

    public String getFullDetails() {
        return name + "\nCategory: " + category + "\n₹" + price + "\n\n" + description;
    }
}

// LoginFrame CLASS
class LoginFrame1 extends JFrame {
    JTextField username;
    JTextField email;
    JTextField contact_no;
    JPasswordField password;

    public LoginFrame1() {
    	setTitle("Login");
    	setSize(300, 300);
    	setLayout(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);

    	// Username
    	JLabel userLabel = new JLabel("Username:");
    	userLabel.setBounds(30, 30, 80, 25);
    	add(userLabel);

    	username = new JTextField();
    	username.setBounds(120, 30, 130, 25);
    	add(username);

    	// Email
    	JLabel emailLabel = new JLabel("Email:");
    	emailLabel.setBounds(30, 70, 80, 25);
    	add(emailLabel);

    	email = new JTextField();
    	email.setBounds(120, 70, 130, 25);
    	add(email);

    	// Contact No
    	JLabel contactLabel = new JLabel("Contact No:");
    	contactLabel.setBounds(30, 110, 80, 25);
    	add(contactLabel);

    	contact_no = new JTextField();
    	contact_no.setBounds(120, 110, 130, 25);
    	add(contact_no);

    	// Password
    	JLabel passLabel = new JLabel("Password:");
    	passLabel.setBounds(30, 150, 80, 25);
    	add(passLabel);

    	password = new JPasswordField();
    	password.setBounds(120, 150, 130, 25);
    	add(password);

    	// Login Button
    	JButton loginBtn = new JButton("Login");
    	loginBtn.setBounds(90, 200, 100, 30);
    	add(loginBtn);

        loginBtn.addActionListener(e -> {
            String enteredUser = username.getText().trim();
            String enteredPass = new String(password.getPassword()).trim();

            String validUser = "user";
            String validPass = "pass";

            if (enteredUser.equals(validUser) && enteredPass.equals(validPass)) {
                new HomeFrame();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid login!");
            }
        });

        setVisible(true);
    }
}

// HomeFrame CLASS
class HomeFrame extends JFrame {
    JComboBox categoryDropdown= new JComboBox();
    DefaultListModel<Product> productListModel;
    JList<Product> productJList;
    JTextArea descriptionArea;
    List<Product> allProducts = new ArrayList<>();
    List<Product> cart = new ArrayList<>();


    public HomeFrame() {
        setTitle("E-Commerce Store");
        setSize(600, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setBounds(20, 20, 100, 25);
        add(categoryLabel);

        categoryDropdown = new JComboBox<>(new String[]{"All","Electronics", "Furniture", "Clothing", "Groceries"});
        categoryDropdown.setBounds(100, 20, 150, 25);
        add(categoryDropdown);

        productListModel = new DefaultListModel<>();
        productJList = new JList<>(productListModel);
        JScrollPane productScroll = new JScrollPane(productJList);
        productScroll.setBounds(20, 60, 250, 300);
        add(productScroll);

        descriptionArea = new JTextArea();
        descriptionArea.setEditable(false);
        JScrollPane descScroll = new JScrollPane(descriptionArea);
        descScroll.setBounds(290, 60, 270, 300);
        add(descScroll);

        JButton addToCart = new JButton("Add to Cart");
        addToCart.setBounds(100, 380, 150, 30);
        add(addToCart);

        JButton viewCart = new JButton("View Cart");
        viewCart.setBounds(320, 380, 150, 30);
        add(viewCart);

        loadProducts();
//        displayProducts("All");

        productJList.addListSelectionListener(e -> {
            Product selected = productJList.getSelectedValue();
            if (selected != null) {
                descriptionArea.setText(selected.getFullDetails());
            }
        });

        categoryDropdown.addActionListener(e -> {
            String selectedCat = (String) categoryDropdown.getSelectedItem();
            displayProducts(selectedCat);
        });

        addToCart.addActionListener(e -> {
            Product selected = productJList.getSelectedValue();
            if (selected != null) {
                cart.add(selected);
                JOptionPane.showMessageDialog(this, "Added to cart!");
            }
        });

        viewCart.addActionListener(e -> new CartFrame(cart));

        setVisible(true);
    }

    void loadProducts() {
        // Existing products (keep unchanged)
        allProducts.add(new Product("Blue T-Shirt", "Clothing", "Stylish cotton t-shirt for everyday wear.", 599));
        allProducts.add(new Product("Jeans", "Clothing", "Comfort-fit jeans with stretch fabric.", 1299));
        allProducts.add(new Product("Rice 5kg", "Groceries", "Premium quality basmati rice.", 450));
        allProducts.add(new Product("Olive Oil", "Groceries", "1L Extra virgin olive oil for cooking.", 750));
        allProducts.add(new Product("Smartphone", "Electronics", "6.5-inch screen, 128GB storage, 5000mAh battery.", 19999));
        allProducts.add(new Product("Bluetooth Speaker", "Electronics", "Portable speaker with 10hr battery life.", 1799));

        // Clothing sub-categories
        String[] clothingSub = {"Men", "Women", "Children", "Boy", "Girl"};
        for (String sub : clothingSub) {
            for (int i = 1; i <= 5; i++) {
                allProducts.add(new Product(sub + " Item " + i, "Clothing", "Description for " + sub + " Item " + i, 500 + i * 100));
            }
        }

        // Electronics sub-categories
        String[] electronicsSub = {"Phones", "Laptops", "Speakers", "Cameras", "Accessories"};
        for (String sub : electronicsSub) {
            for (int i = 1; i <= 5; i++) {
                allProducts.add(new Product(sub + " Item " + i, "Electronics", "Description for " + sub + " Item " + i, 1000 + i * 1000));
            }
        }

        // Furniture sub-categories
        String[] furnitureSub = {"Sofa", "Bed", "Chair", "Table", "Cabinet"};
        for (String sub : furnitureSub) {
            for (int i = 1; i <= 5; i++) {
                allProducts.add(new Product(sub + " Item " + i, "Furniture", "Description for " + sub + " Item " + i, 2000 + i * 500));
            }
        }

        // Groceries sub-categories
        String[] groceriesSub = {"Rice", "Oil", "Vegetables", "Fruits", "Snacks"};
        for (String sub : groceriesSub) {
            for (int i = 1; i <= 5; i++) {
                allProducts.add(new Product(sub + " Item " + i, "Groceries", "Description for " + sub + " Item " + i, 100 + i * 50));
            }
        }
    }



    void displayProducts(String category) {
        productListModel.clear();

        for (Product p : allProducts) {
            if (category.equals("All") || p.category.equalsIgnoreCase(category)) {
                productListModel.addElement(p);
            }
        }
    }


}

// CartFrame CLASS
class CartFrame extends JFrame {
    JTextArea cartArea;
    JButton buyNowButton;
    List<Product> cartItems;

    public CartFrame(List<Product> cartItems) {
        this.cartItems = cartItems;

        setTitle("Your Cart");
        setSize(350, 450);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        cartArea = new JTextArea();
        cartArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(cartArea);
        scrollPane.setBounds(20, 20, 300, 300);
        add(scrollPane);

        buyNowButton = new JButton("Buy Now");
        buyNowButton.setBounds(100, 340, 120, 40);
        add(buyNowButton);

        buyNowButton.addActionListener(e -> new Invoice(cartItems));

        showCart();
        setVisible(true);
    }

    private void showCart() {
        if (cartItems.isEmpty()) {
            cartArea.setText("Your cart is empty.");
            buyNowButton.setEnabled(false);
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Items in your cart:\n\n");

        for (Product p : cartItems) {
            sb.append(p.name).append(" - ₹").append(p.price).append("\n");
        }

        cartArea.setText(sb.toString());
    }
}

// Invoice CLASS
class Invoice extends JFrame {
    public Invoice(List<Product> purchasedItems) {
        setTitle("Invoice");
        setSize(350, 400);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea invoiceDisplay = new JTextArea();
        invoiceDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(invoiceDisplay);
        scrollPane.setBounds(20, 20, 300, 280);
        add(scrollPane);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(120, 320, 100, 30);
        add(closeButton);

        closeButton.addActionListener(e -> dispose());

        int total = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("-------- Invoice --------\n\n");

        for (Product p : purchasedItems) {
            sb.append(p.name).append(" - ₹").append(p.price).append("\n");
            total += p.price;
        }

        sb.append("\n-------------------------\n");
        sb.append("Total: ₹").append(total);

        invoiceDisplay.setText(sb.toString());

        setVisible(true);
    }
}