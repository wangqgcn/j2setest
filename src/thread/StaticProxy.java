package thread;

public class StaticProxy {

    public static void main(String[] args) {
        Agent agent = new Agent(new Landlord());
        agent.rent();
    }
}

interface Rent{
    void rent();
}

class Landlord implements Rent{

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}

class Agent implements Rent{

    private Landlord target;

    public Agent(Landlord target) {
        this.target = target;
    }

    @Override
    public void rent() {
        seeHouse();
        target.rent();
    }

    private void seeHouse() {
        System.out.println("中介带租客看房子");
    }
}