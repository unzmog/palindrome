package palindrome;

import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService {

	public boolean check(String dirtyText) {
		
		String text = dirtyText.replaceAll("[^A-Za-z0-9]", "");
		String begin;
		String end;
		int length = text.length();
		
		if(text.length()>1){
			begin = text.substring(0, length/2);
			if (length%2==0){
				end = text.substring(length/2);
			}else{
				end = text.substring((length/2)+1);
			}
			if (begin.equals(new StringBuilder(end).reverse().toString())){
				return true;
			}else{
				return false;
			}
		}else{
			return true;
		}	
	}
}
