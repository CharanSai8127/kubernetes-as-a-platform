# Retry Storm Cascading Failure

A downstream dependency begins responding slowly.

Clients retry requests aggressively without retry limits.

This amplifies traffic during failure conditions.

Example:

1 failed request
- becomes 3 retries
- multiplied across thousands of clients

The failing dependency receives more traffic during failure than during healthy operation.

This results in:
- queue growth
- timeout amplification
- thread exhaustion
- cluster-wide instability

Mitigation:
- retry budgets
- timeout enforcement
- circuit breakers
- rate limiting
