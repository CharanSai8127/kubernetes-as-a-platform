# Graceful Node Shutdown

Graceful node shutdown allows workloads to terminate safely during node maintenance or infrastructure failures.

Without graceful shutdown:
- inflight requests fail
- pods terminate abruptly
- retries amplify traffic
- applications lose state

Kubernetes coordinates:
- pod eviction
- graceful termination
- workload draining

This reduces instability during:
- node upgrades
- autoscaling events
- infrastructure recovery

Shutdown safety is critical for resilient distributed systems.
