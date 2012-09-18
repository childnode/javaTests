http://stackoverflow.com/questions/230126

1. There is no need for any third-party libraries as like JodaTime for TimeZone conversions unless you need a java.util.Date object with the local time. But this isn't a good idea either cause of the missing TimeZone in DateObject! So remove any use of Date where possible and use a formatter (e.g. SimpleDateFormat) instead as mentioned above.

2. the shortest way to get the current Timestamp:
`Calendar.getInstance().getTime().getTime()` OR `(new Date()).getTime()`

3. for all those out there who want to convert and calculate offsets between Timezones: forget it! Use Calendar and NO: GMT **is not** UTC!!
