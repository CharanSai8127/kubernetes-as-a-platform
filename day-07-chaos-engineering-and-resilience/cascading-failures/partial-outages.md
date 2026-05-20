# Partial Outages

Distributed systems rarely fail:
- completely.

Instead they experience:
- partial operational degradation.

---

# Examples Of Partial Failure

Examples include:
- some requests succeeding
- some timing out
- stale reads
- intermittent DNS failures
- or degraded dependency behavior.

---

# Why Partial Failures Are Difficult

Partial outages create:
- inconsistent symptoms
- intermittent instability
- and unpredictable behavior.

Applications may appear:
- healthy externally
while:
- dependencies fail internally.

---

# Operational Consequences

Partial outages frequently produce:
- retry amplification
- user-facing latency
- queue buildup
- and cascading instability.

---

# Observability Challenges

Intermittent failures are difficult because:
- logs
- metrics
- and traces

may show:
- incomplete operational signals.

---

# Key Insight

Distributed systems frequently fail asymmetrically instead of failing completely.
