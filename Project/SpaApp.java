package Project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class SpaApp extends JFrame {
    private ArrayList<SpaService> bookingList = new ArrayList<>();
    private CardLayout cl = new CardLayout();
    private JPanel container = new JPanel(cl);

    private JTextField txtDate = new JTextField();
    private JComboBox<String> cmbGender = new JComboBox<>(new String[]{"MEN", "WOMEN"});
    private JComboBox<String> cmbType = new JComboBox<>(new String[]{"Thai Massage", "Oil Massage"});
    private JTextField txtQty = new JTextField("1");
    private JTextField txtPrice = new JTextField("350");
    private JComboBox<String> cmbSpecific = new JComboBox<>(new String[]{"Soft", "Medium", "Hard"});

    private JTextArea txtSummary = new JTextArea();
    private JTextField txtSearch = new JTextField(10);
    private DefaultTableModel searchModel = new DefaultTableModel(new String[]{"Type","Date","Gender","Quantity","Price","Total","Description"}, 0);

    public SpaApp() {
        setTitle("Spa Booking System");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        container.add(createMenuPanel(), "MAIN");
        container.add(createAddPanel(),"ADD");
        container.add(createSummaryPanel(),  "SUMMARY");
        container.add(createSearchPanel(), "SEARCH");

        add(container);
        cl.show(container, "MAIN");
    }

    private JPanel createMenuPanel() {
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridwidth = GridBagConstraints.REMAINDER; g.fill = GridBagConstraints.HORIZONTAL; g.insets = new Insets(10, 0, 10, 0);

        p.add(new JLabel("Spa Booking Management System", SwingConstants.CENTER), g);
        JButton b1 = new JButton("Add Service");
        JButton b2 = new JButton("Daily Summary");
        JButton b3 = new JButton("Search Record");

        p.add(b1, g); p.add(b2, g); p.add(b3, g);

        b1.addActionListener(e -> cl.show(container, "ADD"));
        b2.addActionListener(e -> { updateSummary(); cl.show(container, "SUMMARY"); });
        b3.addActionListener(e -> cl.show(container, "SEARCH"));
        return p;
    }

    private JPanel createAddPanel() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        JPanel form = new JPanel(new GridLayout(6, 2, 5, 5));
        form.setBorder(BorderFactory.createTitledBorder("Add Diary Service"));

        form.add(new JLabel("Date (DD/MM/YYYY):")); form.add(txtDate);
        form.add(new JLabel("Therapist Gender:")); form.add(cmbGender);
        form.add(new JLabel("Treatment Type:")); form.add(cmbType);
        form.add(new JLabel("Quantity:")); form.add(txtQty);
        form.add(new JLabel("Price:")); form.add(txtPrice);
        form.add(new JLabel("Specific (Pressure/Scent):")); form.add(cmbSpecific);
        p.add(form, BorderLayout.CENTER);

        cmbType.addItemListener(e -> {
            if (cmbType.getSelectedItem().equals("Thai Massage")) {
                cmbSpecific.setModel(new DefaultComboBoxModel<>(new String[]{"Soft", "Medium", "Hard"}));
                txtPrice.setText("350");
            } else {
                cmbSpecific.setModel(new DefaultComboBoxModel<>(new String[]{"Lavender", "Jasmine", "Rose"}));
                txtPrice.setText("500");
            }
        });

        JPanel bot = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnConfirm = new JButton("Confirm");
        JButton btnBack = new JButton("back to main page");
        bot.add(btnConfirm); bot.add(btnBack);
        p.add(bot, BorderLayout.SOUTH);

        btnConfirm.addActionListener(e -> {
            try {
                String type = (String) cmbType.getSelectedItem();
                String date = txtDate.getText().trim();
                String gender = (String) cmbGender.getSelectedItem();
                int qty = Integer.parseInt(txtQty.getText().trim());
                double price = Double.parseDouble(txtPrice.getText().trim());
                String spec = (String) cmbSpecific.getSelectedItem();

                if (date.isEmpty()) { JOptionPane.showMessageDialog(null, "!!Please enter date!!"); return; }

                SpaService s = type.equals("Thai Massage") ? 
                    new Thaimassegeservice(date, gender, qty, price, spec) : 
                    new OilMassageService(date, gender, qty, price, spec);

                bookingList.add(s);
                JOptionPane.showMessageDialog(null, "Saved successfully!");
                txtDate.setText("");
            } catch (Exception ex) { JOptionPane.showMessageDialog(null, "Invalid number format!"); }
        });

        btnBack.addActionListener(e -> cl.show(container, "MAIN"));
        return p;
    }

    private JPanel createSummaryPanel() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txtSummary.setEditable(false);
        p.add(new JScrollPane(txtSummary), BorderLayout.CENTER);

        JButton btnBack = new JButton("back to main page");
        JPanel bot = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bot.add(btnBack); p.add(bot, BorderLayout.SOUTH);
        btnBack.addActionListener(e -> cl.show(container, "MAIN"));
        return p;
    }

    private void updateSummary() {
        if (bookingList.isEmpty()) { txtSummary.setText("No bookings found."); return; }
        double totalRev = 0;
        StringBuilder sb = new StringBuilder("=== DAILY SUMMARY ===\n\n");
        for (SpaService s : bookingList) {
            totalRev += s.calculateTotal();
            sb.append("- ").append(s.getDescription()).append(" | Qty: ").append(s.getQuantity()).append(" | Total: ").append(s.calculateTotal()).append(" Baht\n");
        }
        sb.append("\nTotal Bookings: ").append(bookingList.size()).append("\nTotal Revenue: ").append(totalRev).append(" Baht");
        txtSummary.setText(sb.toString());
    }

    private JPanel createSearchPanel() {
        JPanel p = new JPanel(new BorderLayout(10, 10));
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel top = new JPanel(new FlowLayout());
        top.add(new JLabel("Keyword:")); top.add(txtSearch);
        JButton btnSearch = new JButton("Search"); top.add(btnSearch);
        p.add(top, BorderLayout.NORTH);

        JTable table = new JTable(searchModel);
        p.add(new JScrollPane(table), BorderLayout.CENTER);

        JButton btnBack = new JButton("back to main page");
        JPanel bot = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bot.add(btnBack); p.add(bot, BorderLayout.SOUTH);

        btnSearch.addActionListener(e -> {
            searchModel.setRowCount(0);
            String kw = txtSearch.getText().trim().toLowerCase();
            for (SpaService s : bookingList) {
                if (s.getDate().toLowerCase().contains(kw) || s.getDescription().toLowerCase().contains(kw) || s.getTherapist().toLowerCase().contains(kw)) {
                    searchModel.addRow(new Object[]{s instanceof Thaimassegeservice ? "Thai" : "Oil", s.getDate(), s.getTherapist(), s.getQuantity(), s.getPrice(), s.calculateTotal(), s.getDescription()});
                }
            }
        });

        btnBack.addActionListener(e -> cl.show(container, "MAIN"));
        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SpaApp().setVisible(true));
    }
}