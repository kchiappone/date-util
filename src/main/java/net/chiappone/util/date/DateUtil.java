package net.chiappone.util.date;

/**
 * @author Kurtis Chiappone
 */
public class DateUtil {

    /**
     * Returns the time and unit (e.g. milliseconds, seconds or minutes).
     *
     * @param time the time
     * @return String pretty time
     */
    public static String getPrettyTime( long time ) {

        String unit = "milliseconds";

        if ( time >= 1000 ) {

            time = time / 1000;
            unit = ( time == 1 ? "second" : "seconds" );

            if ( time >= 60 ) {

                time = time / 60;
                unit = ( time == 1 ? "minute" : "minutes" );

            }

        }

        return time + " " + unit;

    }

}
