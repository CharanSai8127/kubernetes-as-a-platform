# Unsafe Scale In

Pods terminate immediately during scale-in operations.

Inflight requests are interrupted before completion.

This results in:
- dropped user requests
- partial writes
- retry amplification
- inconsistent state

Aggressive shutdown behavior creates instability during recovery and autoscaling events.

Mitigation:
- terminationGracePeriodSeconds
- graceful shutdown
- connection draining
- rollout pacing
