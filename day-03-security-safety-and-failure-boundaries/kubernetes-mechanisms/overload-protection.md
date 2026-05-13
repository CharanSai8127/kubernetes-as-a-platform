# Overload Protection

Distributed systems must protect themselves from overload conditions.

Without overload protection:
- queues grow infinitely
- retries amplify traffic
- thread pools exhaust
- latency spreads across dependencies
- cascading failures occur

## Rate Limiting

Rate limiting controls request volume entering the platform.

This protects:
- APIs
- databases
- caches
- shared dependencies

Rate limiting can exist at:
- gateway layer
- frontend layer
- API layer

## Queue Depth Checks

Back pressure allows workloads to reject or defer work before collapse occurs.

When queue thresholds exceed safe limits:
- workloads may stop accepting requests
- traffic may be delayed
- systems degrade gracefully

## Timeouts

Every distributed request must define timeouts.

Without timeouts:
- hanging connections accumulate
- memory remains allocated
- thread pools exhaust
- retries increase pressure

No timeout results in unbounded resource consumption.

## Retry Budgets

Retries amplify traffic during failure conditions.

Retry budgets introduce controlled retry behavior by limiting retry amplification.

## Circuit Breakers

Circuit breakers stop repeated communication with failing dependencies.

This prevents:
- cascading retries
- dependency overload
- latency amplification

Healthy systems fail in controlled ways instead of accepting infinite pressure.
