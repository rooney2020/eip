#Requirement:
1. Two ways to print the log:
Output to console: ConsoleLogger
	Output to file: FileLogger
2. Each logger could log exception or log exception and message.
log(string exception)
	log(string exception, string message)
Print the message first, then print the exception.
3. Each logger have restriction on message length and exception format
Message:
FileLogger: minLength: 10, maxLength: 20;
		ConsoleLogger: minLength: 5, maxLength: 10;
	Exception:
Start with "Exception".
		No length restriction.
4. If output log fail, throw exception.
5. By using Builder pattern to create ConsoleLogger and FileLogger.
6. No need to output the log to the real file. By using systemout to output the log to console, log message will be started with logger class name.
