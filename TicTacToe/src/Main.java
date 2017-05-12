import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	int counter = 0; //click counter
	
	
	public Main(){
		setSize(700,700); //window size
		setVisible(true); 
		setTitle("Kó³ko i krzy¿yk"); 
		setLayout(new GridLayout(3,3)); 
		
		// create 9 buttons
		for(int i=1; i<10; i++){
			JButton button = new JButton("");
			add(button); //add button to the frame
			
			//button action
			button.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton button = (JButton) e.getSource(); //check which button was clicked
					if(counter%2==0){
						button.setText("X"); 
					}else{
						button.setText("O");
					}
					button.setEnabled(false); // clicking button more than once is not possible
					counter++; 
				}
			});
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

	}

}
