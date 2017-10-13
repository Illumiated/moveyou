package com.mommel.moveyou;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MoveYouServerApplication extends Application<MoveYouServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MoveYouServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "MoveYouServer";
    }

    @Override
    public void initialize(final Bootstrap<MoveYouServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MoveYouServerConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
