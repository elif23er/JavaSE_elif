package week04.Abstract.abstractexample;

public abstract class Enemy {

    int health ;
    int damage;

    public abstract void attack();  // abstract method çünkü her düşnman atağı farklıdır.

    public void takeDmage(int damage){
        health=health-damage;
        System.out.println("Enemy is damaged:"+damage);
        System.out.println("Enemy health is:"+health);

        if(health<=0){
            System.out.println("Enemy is defated.-is killed.");
        }
    }
}
