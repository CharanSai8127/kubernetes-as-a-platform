# KEDA and Event-Driven Scaling

Traditional autoscaling often depends on:
- CPU
- and memory utilization.

Modern distributed systems increasingly require:
- workload-aware
- event-driven
- and asynchronous scaling behavior.

KEDA helps enable this operational model.

---

# Why Event-Driven Scaling Matters

Many production systems process:
- queues
- Kafka streams
- events
- background jobs
- and asynchronous workloads.

CPU usage alone may not accurately represent:
- processing backlog
- operational lag
- or pending workload pressure.

---

# Queue-Aware Scaling

KEDA scales workloads based on:
- queue depth
- Kafka lag
- event volume
- or external operational metrics.

This improves:
- workload responsiveness
- and scaling accuracy

for asynchronous systems.

---

# Backpressure Visibility

Event-driven metrics expose:
- processing imbalance
- backlog growth
- and downstream saturation

more accurately than infrastructure utilization metrics alone.

---

# Operational Benefits

KEDA improves:
- workload-aware scaling
- queue responsiveness
- and event-processing elasticity

inside distributed systems.

---

# Operational Tradeoffs

Event-driven scaling still introduces:
- startup delays
- cold starts
- dependency pressure
- and scaling latency

during sudden workload spikes.

---

# Key Insight

Event-driven scaling improves autoscaling responsiveness by scaling based on operational workload pressure rather than only infrastructure utilization.
