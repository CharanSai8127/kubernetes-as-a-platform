# Horizontal Pod Autoscaler

The Horizontal Pod Autoscaler (HPA) scales:
- workload replicas

based on:
- observed operational metrics.

HPA is one of the most common Kubernetes scaling mechanisms.

---

# Reactive Scaling Model

HPA fundamentally operates as:
- a reactive control loop.

It continuously:
- collects metrics
- evaluates workload pressure
- and adjusts replica counts

after saturation signals become visible.

---

# Why HPA Exists

Distributed systems continuously experience:
- changing traffic
- workload spikes
- concurrency growth
- and operational instability.

HPA attempts to increase:
- processing capacity
- throughput
- and workload distribution

under increasing demand.

---

# Delayed Scaling Reality

HPA scaling is not instantaneous.

Scaling events require:
- metric collection
- autoscaler evaluation
- scheduling
- startup
- readiness
- and traffic propagation

before additional capacity becomes useful.

This creates temporary overload windows.

---

# Scaling Tradeoffs

Aggressive scaling may create:
- cold starts
- scheduling pressure
- resource contention
- and downstream saturation.

Conservative scaling may create:
- delayed responsiveness
- latency spikes
- and temporary overload.

---

# Operational Perspective

Reliable HPA behavior depends heavily on:
- metric quality
- stabilization windows
- minimum replicas
- and workload-aware scaling signals.

---

# Key Insight

HPA is a delayed reactive control system attempting to preserve operational stability under changing workload pressure.
