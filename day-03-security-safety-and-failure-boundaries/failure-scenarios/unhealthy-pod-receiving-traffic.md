# Unhealthy Pod Receiving Traffic

A pod begins receiving traffic before initialization fully completes.

The application may still:
- initialize dependencies
- establish DB pools
- warm caches
- load configuration

Traffic reaches the pod too early.

This results in:
- request failures
- elevated latency
- rollout instability

Mitigation:
- readiness probes
- startup probes
- minReadySeconds
- rollout pacing
