public class UsingArrays{
	public String[] getInput(int count){
		String name[]=new String[count];
		char c='0';
		System.out.println("Enter "+count+" inputs");
		for(int i=0;i<name.length;i++){
		name[i]="";}
for(int x=0;x<name.length;x++){
try{
c=(char)System.in.read();
while(c!='\n'){
name[x]=name[x]+c;
c=(char)System.in.read();}}
catch(Exception err){
System.out.println("Exception error in getting inputs");	}}
return name;}}
