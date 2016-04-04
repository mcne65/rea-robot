package com.reagroup.rearobot.command;

import com.reagroup.rearobot.configuration.Configuration;

/**
 * Applies no transition to the robot but indicates a report should be made in the simulator's main().
 */
public class ReportCommand implements Command {
    @Override
    public Configuration apply(Configuration configuration) {
        return configuration;
    }
}
