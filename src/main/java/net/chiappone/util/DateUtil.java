package net.chiappone.util;

/**
 * @author Kurtis Chiappone
 * @date 10/9/2016
 */
public class DateUtil {

	/**
	 * @param time
	 * @return
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
