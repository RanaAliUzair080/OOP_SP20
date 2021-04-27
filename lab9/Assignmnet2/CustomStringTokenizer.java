/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.util.*;
/**
 *
 * @author Rana Alie
 */
public class CustomStringTokenizer extends StringTokenizer{
    
    public CustomStringTokenizer(String string) {
        super(string);
        
    }
    
    @Override
    public int countTokens(){
        int Tokens = super.countTokens();
        for(int x = 0; x<Tokens; x++){
            String token = super.nextToken();
            for(int y = 0; y<token.length(); y++){
                if(Character.isDigit(token.charAt(y))){
                   Tokens--;
                    break;
                }
            }
        }
        return Tokens-1;
    }
}
