# Controlled Failure Injection

Chaos engineering introduces:
- intentional failures
under:
- controlled operational conditions.

The purpose is:
- validating resilience safely.

---

# Why Controlled Failures Matter

Unexpected production failures are dangerous because:
- systems are unprepared.

Controlled experiments allow teams to:
- observe recovery behavior
- identify weaknesses
- and reduce unknown operational risk.

---

# Common Failure Injection Examples

Examples include:
- pod termination
- node shutdown
- network latency
- packet loss
- dependency unavailability
- DNS failures
- and storage disruption.

---

# Blast Radius Awareness

Failures should initially target:
- small operational scopes

to prevent:
- large-scale outages.

This reduces:
- operational risk during testing.

---

# Key Insight

Controlled failures expose hidden operational weaknesses before uncontrolled failures occur naturally.
