package TemplateMethod;

public abstract class Worker {
    public void dailyRoutine() {
        starRoutine();
        getUp();
        goToWork();
        work();
        goHome();
    }

    protected abstract void work();

    private void goHome() {
        System.out.println("Rentrer chez moi");
    }

    private void goToWork() {
        System.out.println("Aller au travail");
    }

    private void starRoutine() {
        System.out.println("Starting routine!");
    }

    private void getUp() {
        System.out.println("Getting out of bed!");

    }
}
