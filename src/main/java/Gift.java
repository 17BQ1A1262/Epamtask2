public class Gift extends sweets implements choki
{


    public static void main(String[] args)
    {
        int []chocowt=new int[3];
        int wtgift;

        sweets Papidi=new sweets();
        choki silk=new Gift();
        chocowt[0]=silk.ChocolatesWt(15,6);
        wtgift=chocowt[0]+Papidi.Sweetswt(25,9);
        System.out.println("The total gift-one weight is:"+wtgift);

        sweets Mysorepak=new sweets();
        choki Kitkat= (choki) new Gift();
        chocowt[1]=Kitkat.ChocolatesWt(39,9);
        wtgift=chocowt[1]+Mysorepak.Sweetswt(85,10);
        System.out.println("The total gift-two weight is:"+wtgift);

        sweets Rasgulla=new sweets();
        choki Snickers= (choki) new Gift();
        chocowt[2]=Snickers.ChocolatesWt(3,80);
        wtgift=chocowt[2]+Rasgulla.Sweetswt(78,86);
        System.out.println("The total gift-three weight is:"+wtgift);

        for(int i=0;i<chocowt.length;i++)
        {
            for(int j=i+1;j<chocowt.length;j++)
            {
                if(chocowt[i]>chocowt[j])
                {
                    int p=chocowt[i];
                    chocowt[i]=chocowt[j];
                    chocowt[j]=p;
                }
            }
        }
        System.out.println("Chocolates in the gifts the order is:");
        for(int k=0;k<chocowt.length;k++)
        {
            System.out.println(chocowt[k]);
        }
        System.out.println();
    }
    public int ChocolatesWt(int i,int i1) {
        return(i*i1);
    }

}
