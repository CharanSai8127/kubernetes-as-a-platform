# Pod Crashes And Recovery

Pod crashes are common in Kubernetes environments.

Failures may occur due to:
- application bugs
- OOM kills
- aggressive liveness probes
- dependency failures
- or resource exhaustion.

---

# Recovery Behavior

When a pod crashes:
- the Deployment controller detects replica mismatch
- a new pod is scheduled
- containers restart
- readiness checks validate health
- traffic routing resumes safely.

---

# Why Readiness Matters

New pods require time for:
- startup
- dependency initialization
- and application warm-up.

Without readiness checks:
- traffic may reach unhealthy pods,
causing:
- request failures
- latency spikes
- or cascading instability.

---

# Probe Misconfiguration

Aggressive liveness probes may:
- restart overloaded but recoverable pods.

This may amplify:
- restart loops
- instability
- and recovery delay.

---

# Key Insight

Self-healing mechanisms may amplify instability when recovery behavior is configured incorrectly.
