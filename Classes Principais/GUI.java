import javax.swing.*; 

public class  GUI {
    public static void createAndShowGUI() {
    // Create a window for seeing and selecting campaings
    // create a window for managing campaings
    // create an admin window for owner?
    
    JFrame frame = new JFrame("RPGO");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);

        // Create a JPanel for the left side with the list of campaigns
    JPanel leftPanel = new JPanel();
    leftPanel.setLayout(new BorderLayout());

    DefaultListModel<Campanha> campaignListModel = new DefaultListModel<>();
    JList<Campanha> campaignList = new JList<>(campaignListModel);
    // Add your campaign data to the list model (you need to implement this part)

    leftPanel.add(new JScrollPane(campaignList), BorderLayout.CENTER);

    // Create a JPanel for the right side with DM, Players, and Characters
    JPanel rightPanel = new JPanel();
    rightPanel.setLayout(new GridLayout(3, 1));

    JLabel dmLabel = new JLabel("Dungeon Master: ");
    JLabel playersLabel = new JLabel("Players: ");
    JLabel charactersLabel = new JLabel("Characters: ");

    rightPanel.add(dmLabel);
    rightPanel.add(playersLabel);
    rightPanel.add(charactersLabel);

    frame.add(leftPanel, BorderLayout.WEST);
    frame.add(rightPanel, BorderLayout.CENTER);

    frame.setVisible(true);
    }
}