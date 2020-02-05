package eleichter;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class testappApplication extends Application<testappConfiguration> {

    public static void main(final String[] args) throws Exception {
        new testappApplication().run(args);
    }

    @Override
    public String getName() {
        return "testapp";
    }

    @Override
    public void initialize(final Bootstrap<testappConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final testappConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
