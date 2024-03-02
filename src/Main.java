import javax.swing.JOptionPane;
import java.util.ArrayList;
import Users.setUser;

public class Main {
    public static void main(String[] args) {
        ArrayList<setUser> User = new ArrayList<>();
        int option = 0;

        while(option == 0){
            String Nome = JOptionPane.showInputDialog("Insira seu Nome");
            String Email = JOptionPane.showInputDialog("Insira seu Email");
            int Senha = Integer.parseInt(JOptionPane.showInputDialog("Insira sua senha"));

            setUser user = new setUser(Nome, Email, Senha);
            User.add(user);

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado Com Sucesso!");

            option = Integer.parseInt(JOptionPane.showInputDialog("Desja inserir uma nova conta? \n 0 - SIM \n 2 - NÃO"));

            if(option == 2){
                break;
            }
        }

        for(int i = 0; i < User.size(); i++){
            System.out.println(User.get(i));
        }

        String Email = JOptionPane.showInputDialog("Digite seu Email");
        int Senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));

        for(int i = 0; i < User.size(); i++){
            setUser handleInfos = User.get(i);
            if(handleInfos.getEmail().equals(Email) && handleInfos.getPassword() == Senha){
                JOptionPane.showMessageDialog(null,"Usuário Logado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }
        }
    }
}