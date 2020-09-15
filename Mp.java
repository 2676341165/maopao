import java.util.Arrays;

public class Mp {

static int [] s={5,10,5,2,9,3,8};
public static void main(String[] args) {
System.out.println("≈≈–Ú«∞"+Arrays.toString(s));
for(int i=0;i<s.length;i++){
for(int j=0;j<s.length-i-1;j++){
if(s[j]>s[j+1]){
int temp=s[j];
s[j]=s[j+1];
s[j+1]=temp;
}
}
}
System.out.println("≈≈–Ú∫Û"+Arrays.toString(s));
}


}