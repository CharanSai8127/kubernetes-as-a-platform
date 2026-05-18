# CPU Is Not Real Pressure

CPU usage is one of the most common autoscaling signals.

However:
- CPU consumption does not always represent real production pressure.

This is one of the most important scaling realities inside distributed systems.

---

# Why CPU Can Be Misleading

Applications may experience:
- latency growth
- blocked requests
- database waits
- retry storms
- or queue buildup

while CPU usage remains relatively low.

Example:
- API threads waiting on database responses
consume little CPU
while users still experience degraded performance.

---

# Resource Usage vs System Pressure

CPU measures:
- resource consumption.

Production pressure often involves:
- concurrency
- dependency saturation
- queue depth
- latency
- or request backlog.

These are not always reflected through CPU usage alone.

---

# Hidden Saturation

Systems may appear operationally healthy when:
- CPU averages remain low

while:
- downstream systems silently saturate.

This creates delayed autoscaling behavior and hidden instability.

---

# Better Scaling Signals

Modern scaling systems increasingly rely on:
- request rate
- queue depth
- latency
- concurrency
- and external business metrics

to understand operational pressure more accurately.

---

# Operational Perspective

Reliable autoscaling depends on measuring:
- workload stress
not:
- only resource consumption.

---

# Key Insight

CPU usage represents resource activity,
not necessarily real user-facing operational pressure.
