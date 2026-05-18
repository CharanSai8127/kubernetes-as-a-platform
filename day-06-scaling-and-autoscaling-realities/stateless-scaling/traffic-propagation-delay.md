# Traffic Propagation Delay

Scaling does not immediately redistribute traffic to new replicas.

Even after workloads become Ready:
traffic itself still requires time to propagate across the platform.

---

# Why Propagation Delay Exists

Distributed systems require time for:
- endpoint updates
- service discovery
- kube-proxy synchronization
- ingress updates
- and load-balancer convergence

during scaling events.

This introduces additional operational delay.

---

# Hidden Overload Windows

New replicas may already exist while:
- existing replicas still receive most traffic.

This creates temporary imbalance where:
- saturation continues
despite:
- newly available capacity.

---

# Uneven Traffic Distribution

Traffic propagation delays may create:
- uneven request distribution
- hotspot replicas
- and localized saturation

inside distributed systems.

Some workloads may temporarily absorb significantly more pressure than others.

---

# Scaling Consequences

Traffic propagation delay increases:
- latency
- retries
- and operational instability

during sudden scaling events.

The faster traffic changes,
the more visible these delays become.

---

# Operational Perspective

Reliable scaling depends on:
- fast convergence
- stable traffic routing
- and workload-aware operational visibility.

---

# Key Insight

New capacity becomes useful only after traffic itself converges toward newly scaled workloads.
