import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  Title extends JFrame {

    private JLabel User;
    private JLabel Group;
    private JLabel Option;
    private JLabel Name;

    private JButton data;
    private JButton diagrama;

    public  Title() {

        super("Курсач");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        User = new JLabel("Шишацький Владислав Васильович" );
        User.setBounds(60,25,300,30);
        add(User);

        Group = new JLabel("БМ-162");
        Group.setBounds(155,5,50,30);
        add(Group);

        Option = new JLabel("Вариант 17");
        Option.setBounds(150,50,80,30);
        add(Option);

        Name = new JLabel("Вартість комплектуючих у складі комп’ютера");
        Name.setBounds(40,75,350,30);
        add(Name);

        data = new JButton("Ввод данных");
        data.setBounds(40,110,140,30);
        add(data);


        data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getSource()==data) {
                  Interface interfac = new Interface();
                }
            }
        });

        diagrama = new JButton("Диаграмма");
        diagrama.setBounds(200,110,140,30);
        add(diagrama);

        getContentPane().add(panel);

        setSize(400,200);
        setVisible(true);


        diagrama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(actionEvent.getSource()==diagrama) {

                }
            }
        });
    }
}
class  Interface extends JFrame{
    private JButton Ok;
    private JLabel Ua;

    private JLabel textCPU;
    private JTextField inputCPU;

    private JLabel textMotherboard;
     JTextField inputMotherboard;

    private JLabel textRAM;
    private JTextField inputRAM;

    private JLabel textHardDrive;
    private JTextField inputHardDrive;

    private JLabel textCase;
    private JTextField inputCase;

    private JLabel textPowerSupply;
    private JTextField inputPowerSupply;

    private JLabel textVideoCard;
    private JTextField inputVideoCard;

    private JLabel textCoolingSystem;
    private JTextField inputCoolingSystem;

    private JLabel textSoundCard;
    private JTextField inputSoundCard;

    public Interface(){
        super("Стоимость компонентов");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);


        textCPU = new JLabel("Процесор");
        textCPU.setBounds(15,2,80,30);
        add(textCPU);

        inputCPU = new JTextField();
        inputCPU.setFont(new Font("serif",Font.PLAIN,14));
        inputCPU.setBounds(165,5,80,25);
        add(inputCPU);


        textMotherboard = new JLabel("Материнская плата");
        textMotherboard.setBounds(15,25,140,30);
        add(textMotherboard);

        inputMotherboard = new JTextField(10);
        inputMotherboard.setFont(new Font("serif",Font.PLAIN,14));
        inputMotherboard.setBounds(165,30,80,25);
        add(inputMotherboard);

        textRAM = new JLabel("Оперативная память");
        textRAM.setBounds(15,50,150,30);
        add(textRAM);

        inputRAM = new JTextField(10);
        inputRAM.setFont(new Font("serif",Font.PLAIN,14));
        inputRAM.setBounds(165,55,80,25);
        add(inputRAM);

        textHardDrive = new JLabel("Жесткий диск");
        textHardDrive.setBounds(15,75,150,30);
        add(textHardDrive);

        inputHardDrive = new JTextField(10);
        inputHardDrive.setFont(new Font("serif",Font.PLAIN,14));
        inputHardDrive.setBounds(165,80,80,25);
        add(inputHardDrive);

        textCase = new JLabel("Корпус");
        textCase.setBounds(15,100,150,30);
        add(textCase);

        inputCase = new JTextField(10);
        inputCase.setFont(new Font("serif",Font.PLAIN,14));
        inputHardDrive.setBounds(165,105,80,25);
        add(inputCase);

        textPowerSupply = new JLabel("Блок питания");
        textPowerSupply.setBounds(15,125,150,30);
        add(textPowerSupply);

        inputPowerSupply = new JTextField(10);
        inputPowerSupply.setFont(new Font("serif",Font.PLAIN,14));
        inputPowerSupply.setBounds(165,130,80,25);
        add(inputPowerSupply);

        textVideoCard = new JLabel("Видеокарта");
        textVideoCard.setBounds(15,150,150,30);
        add(textVideoCard);

        inputVideoCard = new JTextField(10);
        inputVideoCard.setFont(new Font("serif",Font.PLAIN,14));
        inputVideoCard.setBounds(165,155,80,25);
        add(inputVideoCard);

        textCoolingSystem = new JLabel("Система охлаждения");
        textCoolingSystem.setBounds(15,175,150,30);
        add(textCoolingSystem);

        inputCoolingSystem = new JTextField(10);
        inputCoolingSystem.setFont(new Font("serif",Font.PLAIN,14));
        inputCoolingSystem.setBounds(165,180,80,25);
        add(inputCoolingSystem);

        textSoundCard = new JLabel("Звуковая карта");
        textSoundCard.setBounds(15,200,150,30);
        add(textSoundCard);

        inputSoundCard = new JTextField(10);
        inputSoundCard.setFont(new Font("serif",Font.PLAIN,14));
        inputSoundCard.setBounds(165,205,80,25);
        add(inputSoundCard);

        Ok = new JButton("Ok");
        Ok.setBounds(100,250,80,30);
        add(Ok);

        getContentPane().add(panel);

        Ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == Ok) {

                    final PirChart demo = new PirChart("Pie Chart 3D");
                    demo.pack();
                    RefineryUtilities.centerFrameOnScreen(demo);
                    demo.setVisible(true);
                }
            }
        });

        setSize(300,325);
        setVisible(true);

    }

}