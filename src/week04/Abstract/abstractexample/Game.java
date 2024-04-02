package week04.Abstract.abstractexample;

public class Game {



    public static void main(String[] args) {
        Enemy goblin = new Goblin();
        Enemy zombie = new Zombie();
       goblin.attack();
       zombie.attack();


       zombie.takeDmage(20);
       zombie.takeDmage(30);
       zombie.takeDmage(60);

    }
}
