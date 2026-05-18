# HPA Thrashing

Autoscaling systems continuously react to changing workload metrics.

Without stabilization mechanisms:
- workloads may repeatedly scale up
- and scale down rapidly.

This unstable behavior is called:
- HPA thrashing.

---

# Why Thrashing Happens

Traffic patterns frequently fluctuate quickly.

If autoscaling reacts aggressively to:
- short-lived spikes
- temporary drops
- or noisy metrics

replica counts may oscillate continuously.

---

# Operational Consequences

Thrashing creates:
- repeated cold starts
- scheduling churn
- connection instability
- startup overhead
- and resource contention

inside distributed systems.

Instead of improving stability,
autoscaling may amplify operational instability.

---

# Delayed Scaling Feedback

Autoscaling decisions already contain:
- metrics delays
- startup delays
- readiness delays
- and traffic propagation delays.

Aggressive scaling reactions during delayed convergence frequently worsen instability.

---

# Infrastructure Pressure

Frequent scaling events increase:
- image pulling
- CPU spikes
- network usage
- and node pressure

inside Kubernetes environments.

This may affect unrelated workloads sharing infrastructure.

---

# Operational Perspective

Reliable autoscaling depends heavily on:
- stabilization windows
- conservative scaling policies
- workload-aware metrics
- and controlled convergence behavior.

---

# Key Insight

Autoscaling instability frequently emerges when reactive scaling continuously overcorrects delayed operational signals.
