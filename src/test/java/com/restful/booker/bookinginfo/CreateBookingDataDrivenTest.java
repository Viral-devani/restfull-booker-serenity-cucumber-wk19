package com.restful.booker.bookinginfo;

import com.restful.booker.testbase.TestBase;
import com.restful.booker.userinfo.BookingSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;

@UseTestDataFrom("src/test/java/resources/testdata/bookinginfo.csv")
//@RunWith(SerenityParameterizedRunner.class)
public class CreateBookingDataDrivenTest extends TestBase {
    private String firstName;
    private String lastName;
    private int totalPrice;
    private boolean depositPaid;
    private String checkIn;
    private String checkOut;
    private String additionalNeeds;
    @Steps
    BookingSteps bookingSteps;

    @Title("Data driven test for adding multiple bookings to the application")
    @Test
    public void createMultipleBookings() {
        bookingSteps.createBooking(firstName, lastName, totalPrice, depositPaid, checkIn, checkOut, additionalNeeds);
    }

}
