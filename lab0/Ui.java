package lab0;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ui {
    public static void main(String[] args) {
        // 1. สร้างหน้าต่างหลัก (Frame) เปรียบเหมือนกรอบบ้านหรือจอหลักของโปรแกรม
        JFrame frame = new JFrame("โปรแกรมตรวจสอบอายุ");
        frame.setSize(350, 220); // กำหนดขนาดกว้าง 350, สูง 220 พิกเซล
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // สั่งให้ปิดโปรแกรมเมื่อกดกากบาท
        frame.setLayout(null); // ปิดระบบจัด Layout อัตโนมัติ เพื่อให้เรากำหนดพิกัด X, Y เองได้ง่ายๆ

        // 2. สร้างป้ายข้อความ (Label) เพื่อบอกผู้ใช้ว่าช่องนี้ให้ทำอะไร
        JLabel label = new JLabel("Enter your age:");
        label.setBounds(30, 30, 120, 25); // กำหนดตำแหน่ง (X, Y) และขนาด (ความกว้าง, ความสูง)
        frame.add(label); // นำป้ายข้อความแปะลงไปในหน้าต่างหลัก

        // 3. สร้างช่องรับข้อความ (Text Field) ให้ผู้ใช้คลิกพิมพ์ข้อมูลได้
        JTextField textField = new JTextField();
        textField.setBounds(150, 30, 130, 25);
        frame.add(textField); // นำกล่องพิมพ์ข้อความแปะลงไปในหน้าต่างหลัก

        // 4. สร้างปุ่มกด (Button) สำหรับให้ผู้ใช้คลิกสั่งงาน
        JButton button = new JButton("examine");
        button.setBounds(100, 80, 120, 35);
        frame.add(button); // นำปุ่มกดแปะลงไปในหน้าต่างหลัก

        // 5. ใส่คำสั่งดักจับเหตุการณ์ (ActionListener) ให้ปุ่มทำงานเมื่อถูกคลิก
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ใช้ try-catch เป็นตาข่ายนิรภัย ป้องกันโปรแกรมพังเวลาผู้ใช้กรอกข้อมูลผิดพลาด
                try {
                    // ดึงข้อความจากช่องพิมพ์ แล้วแปลงร่างเป็นตัวเลข int
                    String input = textField.getText();
                    int age = Integer.parseInt(input); 

                    // เช็คเงื่อนไขอายุตามตรรกะปกติ
                    if (age >= 18) {
                        JOptionPane.showMessageDialog(frame, "pass! you are ready " + age + " yaears old (you can log in)");
                    } else {
                        JOptionPane.showMessageDialog(frame, "not pass ! you are not ready 18 years old");
                    }
                } catch (NumberFormatException ex) {
                    // แผนสำรอง: ถ้าผู้ใช้เผลอพิมพ์ตัวหนังสือหรือเว้นว่างไว้ จะเด้งเตือนตรงนี้แทนที่จะแครช
                    JOptionPane.showMessageDialog(frame, "please enter numbers only!", "error! ", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // 6. คำสั่งสำคัญ! สั่งเปิดไฟเปิดหน้าต่าง UI ให้แสดงผลขึ้นมาบนหน้าจอจริงๆ
        frame.setVisible(true);
    }
}