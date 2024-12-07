/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifetime;

/**
 *
 * @author PICHAU
 */
public class Login {
    
    private final String usuarioCorreto = "admin";
    private final String senhaCorreta = "1234";

    public boolean autenticar(String usuario, String senha) {
        // Verifica se o usuário e a senha correspondem aos valores corretos
        return usuarioCorreto.equals(usuario) && senhaCorreta.equals(senha);
    }
}

    

