class Training
{
 public static void main(String[] args)
 {
  
  for(int i=1;i<=100;i++)
  {
  if(i%2==1) // oddnumber
  System.out.println(i);
  }
  for(int i=0;i<=100;i++)
  {
  if(i%2==0) // even number
  System.out.println(i);
  }
  int n=0;
  for(int i=1;i<=100;i++)
  {
  if(i%2==1)
  n=n+1;
  System.out.println(n);
  }
   
 }
}