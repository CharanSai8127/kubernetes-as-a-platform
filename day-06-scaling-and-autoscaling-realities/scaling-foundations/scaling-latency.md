# Scaling Latency

Scaling is not instantaneous.

Distributed systems require time before newly added capacity becomes operationally useful.

This delay is called:
- scaling latency.

---

# Why Scaling Latency Exists

Scaling involves multiple operational stages:
- metrics collection
- autoscaler evaluation
- scheduling
- node provisioning
- startup
- readiness validation
- and traffic propagation.

Each stage introduces additional delay.

---

# Temporary Overload Windows

During scaling latency:
- existing workloads continue absorbing traffic pressure

while:
- new capacity is still unavailable.

This creates temporary saturation windows where:
- latency increases
- retries occur
- and failures may propagate.

---

# Infrastructure Delays

Scaling infrastructure may require:
- cloud VM provisioning
- node initialization
- kubelet registration
- and network setup

before workloads can schedule successfully.

Infrastructure scaling is frequently slower than workload scaling.

---

# Application Delays

Applications require:
- startup time
- dependency initialization
- cache warmup
- and readiness validation

before becoming capable of serving traffic safely.

---

# Operational Reliability

Reliable systems compensate for scaling latency through:
- minimum replicas
- overprovisioning
- stabilization windows
- and predictive scaling strategies.

---

# Key Insight

Autoscaling reacts to pressure immediately,
but operational capacity becomes available only after delayed convergence completes.
