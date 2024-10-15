import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.GridLayout;

public class Main extends JFrame{

  public Main() {
    setSize(80, 80);
    setLocation(0, 0);
    setTitle("JFrame");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setLayout(new GridLayout(5, 5));

    JLabel myLabel = new JLabel("JLabel");
    add(myLabel);

    JButton myButton = new JButton("JButton");
    add(myButton);

    JTextField myTextField = new JTextField("JTextField");
    add(myTextField);

    JPasswordField myPasswordField = new JPasswordField("JPasswordField");
    add(myPasswordField);

    JTextArea myTextArea = new JTextArea("JTextArea");
    JScrollPane myScrollPane = new JScrollPane(myTextArea);
    add(myScrollPane);

    JCheckBox myCheckBox = new JCheckBox("JCheckBox");
    add(myCheckBox);

    JRadioButton myRadioButton1 = new JRadioButton("JRadioButton 1");
    JRadioButton myRadioButton2 = new JRadioButton("JRadioButton 2");
    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(myRadioButton1);
    buttonGroup.add(myRadioButton2);
    JPanel myRadioButtonPanel = new JPanel();
    myRadioButtonPanel.setBorder(new TitledBorder("My radio button panel"));
    myRadioButtonPanel.add(myRadioButton1);
    myRadioButtonPanel.add(myRadioButton2);
    add(myRadioButtonPanel);

    String[] myListItems = new String[]{"Item 1", "Item 2", "Item 3"};
    JList<String> myList = new JList<String>(myListItems);
    add(myList);

    String[] myComboItems = new String[]{"Item 1", "Item 2", "Item 3"};

    JComboBox<String> myComboBox = new JComboBox<String>(myComboItems);
    add(myComboBox);

    JSlider mySlider = new JSlider(0, 100, 50);
    add(mySlider);

    DefaultMutableTreeNode treeRoot = new DefaultMutableTreeNode("Tree root");
    
    DefaultMutableTreeNode treeBranch1 = new DefaultMutableTreeNode("Tree branch 1");
    
    DefaultMutableTreeNode treeBranch2 = new DefaultMutableTreeNode("Tree branch 2");
    
    DefaultMutableTreeNode treeLeaf = new DefaultMutableTreeNode("Tree leaf");

    treeRoot.add(treeBranch1);
    treeRoot.add(treeBranch2);
    treeBranch2.add(treeLeaf);

    JTree myTree = new JTree(treeRoot);
    add(myTree);

    String[][] tableData = {{"1", "2", "3"}, {"4", "5", "6"}};

    String[] tableHeadings = {"Col1", "Col2", "Col3"};

    JTable myTable = new JTable(tableData, tableHeadings);
    add(myTable);

    JTabbedPane myTabbedPane = new JTabbedPane();
    myTabbedPane.addTab("Tab 1", new JLabel("Tab 1"));
    myTabbedPane.addTab("Tab 2", new JLabel("Tab 2"));
    myTabbedPane.addTab("Tab 3", new JLabel("Tab 3"));
    add(myTabbedPane);

    JSplitPane mySplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JLabel("Left"), new JLabel("Right"));
    add(mySplitPane);


    setVisible(true);
  }
  public static void main(String[] args) {
    new Main();
  }
}
