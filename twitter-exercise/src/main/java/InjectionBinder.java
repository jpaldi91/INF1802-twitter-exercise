import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

public class InjectionBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(TwitterLifecycleManager.class)
                .to(LifecycleManager.class)
                .in(Singleton.class);
    }
}
