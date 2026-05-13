# Progressive Delivery and Timing

Time is a safety mechanism in distributed systems.

Instant changes increase instability.

Controlled gradual transitions improve reliability.

## minReadySeconds

minReadySeconds ensures pods remain healthy for a minimum duration before rollout continues.

This protects against:
- unstable startups
- temporary readiness success
- rollout instability

## terminationGracePeriodSeconds

Graceful termination allows inflight requests to complete before containers exit.

This reduces:
- dropped requests
- partial transactions
- retry amplification

## Delayed Rollouts

Deployments should occur gradually with pauses between batches.

This allows:
- metric observation
- dependency validation
- safer rollback

## Progressive Delivery

Canary deployments gradually increase traffic exposure to new versions.

This limits:
- failure amplification
- blast radius
- production instability

## Cooldown Windows

Cooldown windows prevent aggressive scaling oscillations.

Systems require stabilization time between scaling events.

Distributed systems become safer when change happens gradually.
