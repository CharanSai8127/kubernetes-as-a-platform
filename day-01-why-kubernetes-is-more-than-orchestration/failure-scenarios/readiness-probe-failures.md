# Readiness Probe Failures

Readiness probes determine whether a workload is ready to receive traffic.

A Pod may be running successfully while still being unavailable to users if readiness checks fail.

---

# Common Causes

## Incorrect Probe Path

The application endpoint configured in the readiness probe may not exist.

Example:

```yaml
readinessProbe:
  httpGet:
    path: /health
