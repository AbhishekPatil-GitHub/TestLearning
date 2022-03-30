import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64EncodeDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		Base64.Decoder decoder = Base64.getUrlDecoder();
		
		final String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkJhZWxkdW5nIFVzZXIiLCJpYXQiOjE1MTYyMzkwMjJ9.qH7Zj_m3kY69kxhaQXTa-ivIpytKXXjZc1ZSmapZnGE";
		String[] tokenChunks=token.split("\\.");
		String Decodedheader=new String(decoder.decode(tokenChunks[0]));
		String Decodedpayload=new String(decoder.decode(tokenChunks[1]));
		
		System.out.println(Decodedheader);
		System.out.println(Decodedpayload);
		
		
		

	}

}
