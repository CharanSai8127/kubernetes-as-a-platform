# Autoscaling Is Reactive

Autoscaling systems react only after:
- operational pressure already appears.

This means scaling frequently begins after:
- latency
- retries
- queue buildup
- or saturation

already starts affecting workloads.

---

# Delayed Convergence

Scaling requires time for:
- metrics collection
- scheduling
- startup
- readiness
- and traffic propagation.

Additional replicas therefore become useful only after:
- delayed operational convergence.

---

# Operational Consequences

Reactive scaling may temporarily create:
- overload windows
- latency spikes
- and unstable scaling behavior

during sudden traffic changes.

---

# Key Insight

Autoscaling improves capacity after pressure becomes visible,
not before instability begins.
