# Metrics-Server Limitations

Metrics-server is commonly used as the default metrics provider for Kubernetes autoscaling.

It primarily exposes:
- CPU usage
- and memory usage

for workloads and nodes.

While useful,
these metrics are frequently insufficient for understanding real production pressure.

---

# Why CPU Alone Is Incomplete

Distributed systems may experience:
- latency spikes
- queue buildup
- blocked requests
- downstream failures
- or connection saturation

while CPU usage still appears healthy.

Example:
- application threads waiting on database responses
may produce:
- low CPU usage
while users still experience failures.

---

# Operational Blind Spots

Metrics-server does not directly expose:
- request latency
- concurrency pressure
- queue depth
- business traffic
- retry storms
- or dependency saturation.

This creates incomplete autoscaling visibility.

---

# Reactive Scaling Problems

Reactive autoscaling depends heavily on:
- metric quality
- and signal accuracy.

Poor signals create:
- delayed scaling
- unstable scaling behavior
- and incorrect operational decisions.

---

# Scaling Accuracy

Good autoscaling requires metrics that represent:
- real system pressure
instead of:
- only resource consumption.

This is why modern systems increasingly depend on:
- custom metrics
- external metrics
- and workload-aware scaling signals.

---

# Operational Perspective

Reliable scaling depends heavily on:
- high-quality operational visibility
- workload-aware telemetry
- and accurate saturation signals.

---

# Key Insight

CPU and memory usage alone do not fully represent operational pressure inside distributed systems.
