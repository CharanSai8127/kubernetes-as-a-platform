# Golden Signals

Distributed systems expose operational instability through behavioral signals.

The four golden signals help engineers reason about:
- workload health
- system pressure
- user experience
- and infrastructure stability

These signals are:
- latency
- traffic
- errors
- and saturation

---

# Latency

Latency measures how long systems take to respond.

Increasing latency often indicates:
- dependency pressure
- overloaded infrastructure
- networking instability
- or resource exhaustion

Latency usually appears before complete outages occur.

---

# Traffic

Traffic measures system demand.

Examples include:
- request volume
- throughput
- and connection patterns

Traffic visibility helps engineers understand:
- workload pressure
- scaling requirements
- and dependency behavior

Unexpected traffic spikes may amplify instability rapidly.

---

# Errors

Errors indicate failed operational behavior.

Examples include:
- failed requests
- application exceptions
- dependency timeouts
- and infrastructure failures

Error visibility helps identify:
- unstable services
- degraded dependencies
- and operational regressions

---

# Saturation

Saturation measures how close systems are to operational limits.

Examples include:
- CPU exhaustion
- memory pressure
- queue depth
- and connection exhaustion

Saturation often predicts instability before outages appear.

---

# Why Golden Signals Matter

Golden signals help engineers:
- identify instability early
- correlate operational pressure
- and understand system behavior under load

They improve:
- monitoring
- alerting
- operational visibility
- and reliability engineering

---

# Kubernetes Perspective

Kubernetes environments continuously change due to:
- autoscaling
- deployments
- workload movement
- and infrastructure elasticity

Golden signals become critical for understanding:
- workload health
- platform behavior
- and distributed-system pressure

---

# Key Insight

Golden signals expose how distributed systems behave under operational pressure long before complete outages occur.
