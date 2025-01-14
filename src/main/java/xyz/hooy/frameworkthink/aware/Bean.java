package xyz.hooy.frameworkthink.aware;

public class Bean implements ContextAware {

    private Context context;

    @Override
    public void setContext(Context context) {
        this.context = context;
    }

    public String getContextName() {
        return context.getName();
    }
}
