package elevator.assertions;

import elevator.Command;
import elevator.Commands;
import elevator.Elevator;

public class Assertions {

    public static ElevatorAssert assertThat(final Elevator actual) {
        return new ElevatorAssert(actual);
    }

    public static CommandAssert assertThat(Command actual) {
        return new CommandAssert(actual);
    }

    public static CommandsAssert assertThat(Commands actual) {
        return new CommandsAssert(actual);
    }
}