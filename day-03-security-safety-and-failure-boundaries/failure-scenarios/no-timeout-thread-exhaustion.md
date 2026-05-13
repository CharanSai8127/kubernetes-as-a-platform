# No Timeout Thread Exhaustion

A backend service communicates with a slow external dependency.

Requests do not define timeouts.

Connections remain open indefinitely while waiting for responses.

Over time:
- threads remain blocked
- sockets accumulate
- memory usage increases
- queue latency grows

Eventually:
- no worker threads remain available
- the service stops responding entirely

Mitigation:
- timeout enforcement
- connection pooling
- retry budgets
- circuit breakers
