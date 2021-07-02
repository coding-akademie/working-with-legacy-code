package org.craftedsw.tripservicekata.trip;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.jupiter.api.Test;

public class TripServiceShould {
    private static final User GUEST = null;
    private static final User UNUSED_USER = null;
    private User loggedInUser = null;

    @Test
    void throw_an_exception_if_user_is_not_logged_in() {
        TripService tripService = new TestableTripService();
        loggedInUser = GUEST;

        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(UNUSED_USER));
    }

    private class TestableTripService extends TripService {

        @Override
        protected User getLoggedInUser() {
            return loggedInUser;
        }
    }
}
