import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
class Gigasecond {
	//LocalDate ld;
	LocalDateTime ldt;
    Gigasecond(LocalDate moment) {
        this.ldt = moment.atTime(0,0,0);
    }

    Gigasecond(LocalDateTime moment) {
        this.ldt = moment;
    }

    LocalDateTime getDateTime() {
        this.ldt = (this.ldt.plusSeconds((int)Math.pow(10,9)));
        return this.ldt;
    }

}
